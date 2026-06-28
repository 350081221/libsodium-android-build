.class public Lf3/f;
.super Ljava/lang/Exception;
.source "SourceFile"


# static fields
.field private static final IMAGE_DECODE_FAILURE:Ljava/lang/String; = "Image Decode Failure"


# instance fields
.field private error:Ljava/lang/OutOfMemoryError;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Image Decode Failure"

    .line 1
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "Image Decode Failure"

    .line 2
    invoke-direct {p0, v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3
    instance-of v0, p1, Ljava/lang/OutOfMemoryError;

    if-eqz v0, :cond_0

    .line 4
    check-cast p1, Ljava/lang/OutOfMemoryError;

    iput-object p1, p0, Lf3/f;->error:Ljava/lang/OutOfMemoryError;

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;ZZ)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    const-string v0, "Image Decode Failure"

    .line 5
    invoke-direct {p0, v0, p1, p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 6
    instance-of p2, p1, Ljava/lang/OutOfMemoryError;

    if-eqz p2, :cond_0

    .line 7
    check-cast p1, Ljava/lang/OutOfMemoryError;

    iput-object p1, p0, Lf3/f;->error:Ljava/lang/OutOfMemoryError;

    :cond_0
    return-void
.end method


# virtual methods
.method public printStackTrace()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf3/f;->error:Ljava/lang/OutOfMemoryError;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public printStackTrace(Ljava/io/PrintStream;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lf3/f;->error:Ljava/lang/OutOfMemoryError;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-super {p0, p1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :goto_0
    return-void
.end method

.method public printStackTrace(Ljava/io/PrintWriter;)V
    .locals 1

    .line 7
    iget-object v0, p0, Lf3/f;->error:Ljava/lang/OutOfMemoryError;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    :goto_0
    return-void
.end method
