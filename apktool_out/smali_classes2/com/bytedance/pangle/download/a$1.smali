.class final Lcom/bytedance/pangle/download/a$1;
.super Lcom/bytedance/pangle/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/pangle/download/a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/pangle/download/a;


# direct methods
.method constructor <init>(Lcom/bytedance/pangle/download/a;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/pangle/download/a$1;->a:Lcom/bytedance/pangle/download/a;

    invoke-direct {p0}, Lcom/bytedance/pangle/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/pangle/download/a$1;->a:Lcom/bytedance/pangle/download/a;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/pangle/download/a;->a(Lcom/bytedance/pangle/download/a;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/bytedance/pangle/download/b;->a()Lcom/bytedance/pangle/download/b;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method
