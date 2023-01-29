package networking;

//import networking.protocols.HttpProtocol;
import networking.protocols.*;

public class SocketConnection {

		public static void main(String[] args) {
			
			HttpProtocol http1 = new HttpProtocol();
			
			HttpProtocol http2 = new HttpProtocol();
						
			TcpProtocol tcp = new TcpProtocol();
		}
}
