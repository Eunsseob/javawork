package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * Socket
 * 	- 프로세스간의 통신 담당
 * 	- InputStream / OutputStream을 가지고 있음 (이 스트림을 통해 입출력이 이루어짐)
 * 	- 소켓 프로그램(TCP/UDP)
 * 		> TCP방식 : 데이터 전송속도가 느림, 정확하고 안정적으로 전달 가능(신뢰성이 요구되는 프로그램에 사용 : http 등등)
 * 		- 서버, 클라이언트 간의 1:1 소켓 통신
 * 		- 데이터를 교환하기에 앞서 서버, 클라이언트
 * 		> UDP방식 : 데이터 전송속도 빠름, 신뢰성이 없는 데이터 전달(실시간 동영상 서비스, PtoP)
 *	- 서버소켓
 *		- 포트와 연결(Bind)되어 외부의 연결 요청을 기다리다 요청이 들어오면 수락해줄 용도 
 *		- 수락 => 통신할 수 있는 socket 생성
 *
 */
public class ServerProgram2 {

	public static void main(String[] args) {
		// 1) 포트번호 지정
		int port = 3005;
		Scanner sc = new Scanner(System.in);
		
		try {
			try(ServerSocket server = new ServerSocket(port);){
				
				// 3. 클라이언트의 연결요청이 올 때까지 대기 상태
				System.out.println("클라이언트의 요청을 기다리고 있음...");
				
				// 4. 연결 요청이 오면 수락 후 클라이언트와 통신할수 있는 소켓 객체 생성
				Socket socket = server.accept();
				
				System.out.println(socket.getInetAddress());
				
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
					PrintWriter pw = new PrintWriter(socket.getOutputStream());{
						pw.println("환영합니다. 😊😊");
						pw.flush(); // 현재 스트림의 데이터를 강제로 내보내고 비움
						
						while(true) {
							System.out.println("클라이언트 : " + br.readLine());
							
							System.out.print("서버 : ");
							pw.println(sc.nextLine());
							pw.flush();
						}
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
