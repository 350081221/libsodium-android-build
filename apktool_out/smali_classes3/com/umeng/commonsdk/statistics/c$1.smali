.class Lcom/umeng/commonsdk/statistics/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/statistics/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/commonsdk/statistics/c;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/commonsdk/statistics/c;


# direct methods
.method constructor <init>(Lcom/umeng/commonsdk/statistics/c;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/c$1;->a:Lcom/umeng/commonsdk/statistics/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onImprintChanged(Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/c$1;->a:Lcom/umeng/commonsdk/statistics/c;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/c;->a(Lcom/umeng/commonsdk/statistics/c;)Lcom/umeng/commonsdk/statistics/noise/Defcon;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/umeng/commonsdk/statistics/noise/Defcon;->onImprintChanged(Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/umeng/commonsdk/statistics/c$1;->a:Lcom/umeng/commonsdk/statistics/c;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/c;->b(Lcom/umeng/commonsdk/statistics/c;)Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "track_list"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p1, Lcom/umeng/commonsdk/statistics/c;->a:Ljava/lang/String;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
.end method
