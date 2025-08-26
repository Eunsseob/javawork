package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientProgram3 {
    public static void main(String[] args) {
        int port = 3005;
        Scanner sc = new Scanner(System.in);

        try (
            Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), port);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true) // auto-flush ON
        ) {
            System.out.println("서버와 연결 성공!");

            String serverMsg;
            String sendMsg;

            while ((serverMsg = br.readLine()) != null) {
                // 서버로부터 받은 메시지 출력
                System.out.println("서버 : " + serverMsg);

                // 사용자로부터 메시지 입력
                System.out.print("클라이언트 : ");
                sendMsg = sc.nextLine();

                pw.println(sendMsg); // 서버로 전송

                // 사용자가 "exit" 입력 시 종료
                if (sendMsg.equalsIgnoreCase("exit")) {
                    System.out.println("클라이언트 종료");
                    break;
                }
            }

        } catch (UnknownHostException e) {
            System.out.println("호스트를 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 오류");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
