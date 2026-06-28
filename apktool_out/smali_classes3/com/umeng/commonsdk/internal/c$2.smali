.class final Lcom/umeng/commonsdk/internal/c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/commonsdk/internal/c;->a(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/umeng/commonsdk/listener/OnGetOaidListener;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/commonsdk/internal/c$2;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/umeng/commonsdk/internal/c$2;->b:Lcom/umeng/commonsdk/listener/OnGetOaidListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c$2;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/analytics/pro/aw;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c$2;->b:Lcom/umeng/commonsdk/listener/OnGetOaidListener;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v1, v0}, Lcom/umeng/commonsdk/listener/OnGetOaidListener;->onGetOaid(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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
