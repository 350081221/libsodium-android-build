.class public Lcom/ss/android/socialbase/downloader/model/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private a:Ljava/io/BufferedOutputStream;

.field private b:Ljava/io/FileDescriptor;

.field private c:Ljava/io/RandomAccessFile;


# direct methods
.method public constructor <init>(Ljava/io/File;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    .line 5
    .line 6
    const-string v1, "rw"

    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/e;->c:Ljava/io/RandomAccessFile;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/e;->b:Ljava/io/FileDescriptor;

    .line 18
    .line 19
    if-lez p2, :cond_2

    .line 20
    .line 21
    const/16 p1, 0x2000

    .line 22
    .line 23
    if-ge p2, p1, :cond_0

    .line 24
    .line 25
    :goto_0
    move p2, p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const/high16 p1, 0x20000

    .line 28
    .line 29
    if-le p2, p1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    new-instance p1, Ljava/io/BufferedOutputStream;

    .line 33
    .line 34
    new-instance v0, Ljava/io/FileOutputStream;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/e;->c:Ljava/io/RandomAccessFile;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, v0, p2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/e;->a:Ljava/io/BufferedOutputStream;

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    new-instance p1, Ljava/io/BufferedOutputStream;

    .line 52
    .line 53
    new-instance p2, Ljava/io/FileOutputStream;

    .line 54
    .line 55
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/e;->c:Ljava/io/RandomAccessFile;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/e;->a:Ljava/io/BufferedOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    :goto_2
    return-void

    .line 70
    :catch_0
    move-exception p1

    .line 71
    new-instance p2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 72
    .line 73
    const/16 v0, 0x40f

    .line 74
    .line 75
    invoke-direct {p2, v0, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    throw p2
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method


# virtual methods
.method public a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/e;->a:Ljava/io/BufferedOutputStream;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/e;->b:Ljava/io/FileDescriptor;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V

    :cond_1
    return-void
.end method

.method public a(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/e;->c:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p1, p2}, Ljava/io/RandomAccessFile;->seek(J)V

    return-void
.end method

.method public a([BII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/e;->a:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/BufferedOutputStream;->write([BII)V

    return-void
.end method

.method public b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/e;->a:Ljava/io/BufferedOutputStream;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    :cond_0
    return-void
.end method

.method public b(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/e;->c:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p1, p2}, Ljava/io/RandomAccessFile;->setLength(J)V

    return-void
.end method

.method public c()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/e;->b:Ljava/io/FileDescriptor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
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
.end method

.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Ljava/io/Closeable;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/e;->c:Ljava/io/RandomAccessFile;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/e;->a:Ljava/io/BufferedOutputStream;

    .line 11
    .line 12
    aput-object v2, v0, v1

    .line 13
    .line 14
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
