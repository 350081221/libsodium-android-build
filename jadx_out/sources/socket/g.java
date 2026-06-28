package socket;

import android.util.Log;
import com.lody.virtual.os.VUserHandle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22386a = "g";

    /* renamed from: b, reason: collision with root package name */
    private static int f22387b = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final String f22390e = "127.0.0.1";

    /* renamed from: c, reason: collision with root package name */
    private static List<Socket> f22388c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static c f22389d = null;

    /* renamed from: f, reason: collision with root package name */
    public static int f22391f = VUserHandle.FIRST_SHARED_APPLICATION_GID;

    /* loaded from: classes4.dex */
    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Socket f22392a;

        /* renamed from: b, reason: collision with root package name */
        private final f f22393b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        InputStream inputStream = this.f22392a.getInputStream();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                            if (read < 2048) {
                                this.f22393b.o(true, byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                        }
                        if (!this.f22392a.isClosed()) {
                            this.f22392a.close();
                            Log.i(g.f22386a, "客户端连接已关闭");
                        }
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        this.f22393b.o(false, null);
                        if (!this.f22392a.isClosed()) {
                            this.f22392a.close();
                            Log.i(g.f22386a, "客户端连接已关闭");
                        }
                    }
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    if (!this.f22392a.isClosed()) {
                        this.f22392a.close();
                        Log.i(g.f22386a, "客户端连接已关闭");
                    }
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                throw th;
            }
        }

        private b(Socket socket2, f fVar) {
            this.f22392a = socket2;
            this.f22393b = fVar;
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private ServerSocket f22394a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f22395b = false;

        /* renamed from: c, reason: collision with root package name */
        private f f22396c;

        /* renamed from: d, reason: collision with root package name */
        private ExecutorService f22397d;

        public c(f fVar) {
            try {
                this.f22396c = fVar;
                if (this.f22394a == null) {
                    ServerSocket serverSocket = new ServerSocket();
                    this.f22394a = serverSocket;
                    serverSocket.setReuseAddress(true);
                    this.f22394a.bind(new InetSocketAddress(g.f22391f));
                    Log.i(g.f22386a, "ServerThread: 启动服务，端口号：" + g.f22391f);
                }
                this.f22397d = Executors.newCachedThreadPool();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }

        public void a() {
            this.f22395b = true;
            ServerSocket serverSocket = this.f22394a;
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                    Log.i(g.f22386a, "已关闭服务");
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f22395b) {
                try {
                    try {
                        Socket accept = this.f22394a.accept();
                        g.f22388c.add(accept);
                        this.f22396c.j(accept.getInetAddress().getHostAddress());
                        this.f22397d.submit(new b(accept, this.f22396c));
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                } finally {
                    this.f22397d.shutdown();
                }
            }
        }
    }

    public static void b() {
        Iterator it = new ArrayList(f22388c).iterator();
        while (it.hasNext()) {
            Socket socket2 = (Socket) it.next();
            try {
                if (socket2.isOutputShutdown()) {
                    socket2.shutdownOutput();
                }
                if (!socket2.isInputShutdown()) {
                    socket2.shutdownInput();
                }
                if (!socket2.isClosed()) {
                    socket2.close();
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        c cVar = f22389d;
        if (cVar != null) {
            cVar.a();
        }
        f22388c.clear();
    }

    public static c c(f fVar) {
        if (f22389d != null) {
            b();
        }
        f22389d = new c(fVar);
        new Thread(f22389d).start();
        Log.i(f22386a, "开启服务成功");
        return f22389d;
    }
}
