.class Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;
.super Ljavax/net/ssl/SSLSocketFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/tileprovider/modules/TileDownloader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CompatibilitySocketFactory"
.end annotation


# instance fields
.field sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method constructor <init>(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method private upgradeTlsAndRemoveSsl(Ljavax/net/ssl/SSLSocket;)Ljavax/net/ssl/SSLSocket;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedProtocols()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "TLSv1.2"

    .line 10
    .line 11
    invoke-static {v0, v2}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ltz v0, :cond_0

    .line 16
    .line 17
    filled-new-array {v2}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "SSLv3"

    .line 23
    .line 24
    invoke-static {v1, v0}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ltz v0, :cond_2

    .line 29
    .line 30
    array-length v2, v1

    .line 31
    add-int/lit8 v2, v2, -0x1

    .line 32
    .line 33
    new-array v3, v2, [Ljava/lang/String;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static {v1, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    if-le v2, v0, :cond_1

    .line 40
    .line 41
    add-int/lit8 v4, v0, 0x1

    .line 42
    .line 43
    sub-int/2addr v2, v0

    .line 44
    invoke-static {v1, v4, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    .line 46
    .line 47
    :cond_1
    move-object v1, v3

    .line 48
    :cond_2
    :goto_0
    invoke-virtual {p1, v1}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object p1
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public createSocket()Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    .line 2
    invoke-direct {p0, v0}, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->upgradeTlsAndRemoveSsl(Ljavax/net/ssl/SSLSocket;)Ljavax/net/ssl/SSLSocket;

    move-result-object v0

    return-object v0
.end method

.method public createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 5
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 6
    invoke-direct {p0, p1}, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->upgradeTlsAndRemoveSsl(Ljavax/net/ssl/SSLSocket;)Ljavax/net/ssl/SSLSocket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 8
    invoke-direct {p0, p1}, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->upgradeTlsAndRemoveSsl(Ljavax/net/ssl/SSLSocket;)Ljavax/net/ssl/SSLSocket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 10
    invoke-direct {p0, p1}, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->upgradeTlsAndRemoveSsl(Ljavax/net/ssl/SSLSocket;)Ljavax/net/ssl/SSLSocket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 12
    invoke-direct {p0, p1}, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->upgradeTlsAndRemoveSsl(Ljavax/net/ssl/SSLSocket;)Ljavax/net/ssl/SSLSocket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object p1

    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 4
    invoke-direct {p0, p1}, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->upgradeTlsAndRemoveSsl(Ljavax/net/ssl/SSLSocket;)Ljavax/net/ssl/SSLSocket;

    move-result-object p1

    return-object p1
.end method

.method public getDefaultCipherSuites()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->getDefaultCipherSuites()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSupportedCipherSuites()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/TileDownloader$CompatibilitySocketFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
