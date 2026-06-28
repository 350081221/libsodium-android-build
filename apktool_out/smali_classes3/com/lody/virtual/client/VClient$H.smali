.class Lcom/lody/virtual/client/VClient$H;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/VClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "H"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/VClient;


# direct methods
.method private constructor <init>(Lcom/lody/virtual/client/VClient;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/lody/virtual/client/VClient$H;->this$0:Lcom/lody/virtual/client/VClient;

    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/VClient;Lcom/lody/virtual/client/VClient$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/VClient$H;-><init>(Lcom/lody/virtual/client/VClient;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/os/IBinder;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/lody/virtual/client/ipc/VActivityManager;->finishActivity(Landroid/os/IBinder;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_1
    iget-object v0, p0, Lcom/lody/virtual/client/VClient$H;->this$0:Lcom/lody/virtual/client/VClient;

    .line 20
    .line 21
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Lcom/lody/virtual/client/VClient$ReceiverData;

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/lody/virtual/client/VClient;->access$800(Lcom/lody/virtual/client/VClient;Lcom/lody/virtual/client/VClient$ReceiverData;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :pswitch_2
    iget-object v0, p0, Lcom/lody/virtual/client/VClient$H;->this$0:Lcom/lody/virtual/client/VClient;

    .line 30
    .line 31
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lcom/lody/virtual/client/VClient$NewIntentData;

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/lody/virtual/client/VClient;->access$700(Lcom/lody/virtual/client/VClient;Lcom/lody/virtual/client/VClient$NewIntentData;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
