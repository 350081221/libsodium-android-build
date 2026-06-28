.class final Lcom/bytedance/pangle/ZeusPluginStateListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/pangle/ZeusPluginStateListener;->postStateChange(Ljava/lang/String;I[Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/pangle/ZeusPluginStateListener$1;->a:Ljava/lang/String;

    iput p2, p0, Lcom/bytedance/pangle/ZeusPluginStateListener$1;->b:I

    iput-object p3, p0, Lcom/bytedance/pangle/ZeusPluginStateListener$1;->c:[Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/bytedance/pangle/i;->a()Lcom/bytedance/pangle/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/bytedance/pangle/i;->b:Ljava/util/List;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-lez v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/bytedance/pangle/ZeusPluginStateListener;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/bytedance/pangle/ZeusPluginStateListener$1;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    const-string v2, "UNKNOWN"

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    iget-object v2, p0, Lcom/bytedance/pangle/ZeusPluginStateListener$1;->a:Ljava/lang/String;

    .line 43
    .line 44
    :goto_1
    iget v3, p0, Lcom/bytedance/pangle/ZeusPluginStateListener$1;->b:I

    .line 45
    .line 46
    iget-object v4, p0, Lcom/bytedance/pangle/ZeusPluginStateListener$1;->c:[Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v1, v2, v3, v4}, Lcom/bytedance/pangle/ZeusPluginStateListener;->onPluginStateChange(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-void
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
.end method
