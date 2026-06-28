.class Lcom/lody/virtual/client/core/ANRWatchDog$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/core/ANRWatchDog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/core/ANRWatchDog;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/core/ANRWatchDog;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/core/ANRWatchDog$1;->this$0:Lcom/lody/virtual/client/core/ANRWatchDog;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/ANRWatchDog;->access$008()I

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/lody/virtual/client/core/ANRWatchDog;->access$000()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const v0, 0x7fffffff

    .line 9
    .line 10
    .line 11
    rem-int/2addr p1, v0

    .line 12
    invoke-static {p1}, Lcom/lody/virtual/client/core/ANRWatchDog;->access$002(I)I

    .line 13
    .line 14
    .line 15
    return-void
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
.end method
