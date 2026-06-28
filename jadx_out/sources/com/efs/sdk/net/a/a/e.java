package com.efs.sdk.net.a.a;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;

/* loaded from: classes2.dex */
public final class e extends FilterOutputStream {

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f6786b = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    private final Future<Void> f6787a;

    /* loaded from: classes2.dex */
    static class a implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f6788a;

        /* renamed from: b, reason: collision with root package name */
        private final OutputStream f6789b;

        public a(InputStream inputStream, OutputStream outputStream) {
            this.f6788a = inputStream;
            this.f6789b = outputStream;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(this.f6788a);
            try {
                i.a(gZIPInputStream, this.f6789b, new byte[1024]);
                gZIPInputStream.close();
                this.f6789b.close();
                return null;
            } catch (Throwable th) {
                gZIPInputStream.close();
                this.f6789b.close();
                throw th;
            }
        }
    }

    private e(OutputStream outputStream, Future<Void> future) {
        super(outputStream);
        this.f6787a = future;
    }

    public static e a(OutputStream outputStream) {
        PipedInputStream pipedInputStream = new PipedInputStream();
        return new e(new PipedOutputStream(pipedInputStream), f6786b.submit(new a(pipedInputStream, outputStream)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
            try {
            } catch (IOException e5) {
                throw e5;
            }
        } finally {
            try {
                a(this.f6787a);
            } catch (IOException unused) {
            }
        }
    }

    private static <T> T a(Future<T> future) {
        while (true) {
            try {
                return future.get();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                d.a(cause, IOException.class);
                d.a(cause, Error.class);
                d.a(cause, RuntimeException.class);
                throw new RuntimeException(cause);
            }
        }
    }
}
