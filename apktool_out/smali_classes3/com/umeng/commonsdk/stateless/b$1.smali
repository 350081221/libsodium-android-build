.class Lcom/umeng/commonsdk/stateless/b$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/commonsdk/stateless/b;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/commonsdk/stateless/b;


# direct methods
.method constructor <init>(Lcom/umeng/commonsdk/stateless/b;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/commonsdk/stateless/b$1;->a:Lcom/umeng/commonsdk/stateless/b;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/16 v0, 0x200

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    goto :goto_1

    .line 11
    :pswitch_0
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->g()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :pswitch_1
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->f()V

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :pswitch_2
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->e()V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->h()V

    .line 24
    .line 25
    .line 26
    :goto_1
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x111
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
