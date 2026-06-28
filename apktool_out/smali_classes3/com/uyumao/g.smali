.class public Lcom/uyumao/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/uyumao/g$a;
    }
.end annotation


# static fields
.field public static a:Landroid/os/HandlerThread;

.field public static b:Landroid/os/Handler;

.field public static c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/uyumao/g$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Landroid/content/Context;IILcom/uyumao/g$a;Ljava/lang/Object;J)V
    .locals 1

    if-eqz p0, :cond_6

    if-nez p3, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    sget-object p0, Lcom/uyumao/g;->c:Ljava/util/HashMap;

    if-nez p0, :cond_1

    .line 2
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    sput-object p0, Lcom/uyumao/g;->c:Ljava/util/HashMap;

    .line 3
    :cond_1
    div-int/lit8 p0, p2, 0x64

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    .line 4
    sget-object v0, Lcom/uyumao/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 5
    sget-object v0, Lcom/uyumao/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    :cond_2
    sget-object p0, Lcom/uyumao/g;->a:Landroid/os/HandlerThread;

    if-eqz p0, :cond_3

    sget-object p0, Lcom/uyumao/g;->b:Landroid/os/Handler;

    if-nez p0, :cond_5

    :cond_3
    const-class p0, Lcom/uyumao/g;

    monitor-enter p0

    .line 7
    :try_start_0
    sget-object p3, Lcom/uyumao/g;->a:Landroid/os/HandlerThread;

    if-nez p3, :cond_4

    .line 8
    new-instance p3, Landroid/os/HandlerThread;

    const-string v0, "yumao_ccg"

    invoke-direct {p3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object p3, Lcom/uyumao/g;->a:Landroid/os/HandlerThread;

    .line 9
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    .line 10
    sget-object p3, Lcom/uyumao/g;->b:Landroid/os/Handler;

    if-nez p3, :cond_4

    .line 11
    new-instance p3, Lcom/uyumao/f;

    sget-object v0, Lcom/uyumao/g;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p3, v0}, Lcom/uyumao/f;-><init>(Landroid/os/Looper;)V

    sput-object p3, Lcom/uyumao/g;->b:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_4
    monitor-exit p0

    .line 12
    :cond_5
    :try_start_1
    sget-object p0, Lcom/uyumao/g;->b:Landroid/os/Handler;

    if-eqz p0, :cond_6

    .line 13
    invoke-virtual {p0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object p0

    .line 14
    iput p1, p0, Landroid/os/Message;->what:I

    .line 15
    iput p2, p0, Landroid/os/Message;->arg1:I

    .line 16
    iput-object p4, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 17
    sget-object p1, Lcom/uyumao/g;->b:Landroid/os/Handler;

    invoke-virtual {p1, p0, p5, p6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :cond_6
    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;ILcom/uyumao/g$a;Ljava/lang/Object;)V
    .locals 7

    const/16 v1, 0x100

    const-wide/16 v5, 0x0

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 18
    invoke-static/range {v0 .. v6}, Lcom/uyumao/g;->a(Landroid/content/Context;IILcom/uyumao/g$a;Ljava/lang/Object;J)V

    return-void
.end method
