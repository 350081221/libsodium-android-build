.class public final Lcom/huawei/hms/analytics/at;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/huawei/hms/analytics/k;

.field public abc:Z

.field public b:Lcom/huawei/hms/analytics/def;

.field public bcd:Ljava/lang/String;

.field public c:J

.field public cde:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public def:Z

.field public e:Ljava/lang/String;

.field public efg:Z

.field public f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public fgh:Z

.field public g:Ljava/lang/String;

.field public ghi:Landroid/content/Context;

.field public h:Ljava/lang/String;

.field public hij:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public ijk:Ljava/lang/String;

.field public ikl:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Z

.field public klm:Ljava/lang/String;

.field public l:J

.field public lmn:Ljava/lang/String;

.field public m:Z

.field public n:Lcom/huawei/hms/analytics/ay;

.field public o:Ljava/lang/String;

.field public p:Z

.field public q:J

.field public r:Lcom/huawei/hms/analytics/av;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;

.field public v:Ljava/lang/String;

.field public w:J

.field public x:Z

.field private y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/at;->efg:Z

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/at;->def:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/analytics/at;->bcd:Ljava/lang/String;

    const-wide/16 v1, 0x1e

    iput-wide v1, p0, Lcom/huawei/hms/analytics/at;->c:J

    iput-object v0, p0, Lcom/huawei/hms/analytics/at;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/at;->e:Ljava/lang/String;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/huawei/hms/analytics/at;->f:Ljava/util/Map;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/huawei/hms/analytics/at;->y:Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/hms/analytics/at;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/at;->s:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/at;->t:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/at;->u:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/at;->v:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final klm(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/at;->y:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final lmn()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/at;->v:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/at;->v:Ljava/lang/String;

    return-object v0
.end method

.method public final lmn(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/at;->y:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final lmn(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/at;->f:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
