.class public final Lcom/huawei/hms/analytics/bf;
.super Lorg/greenrobot/greendao/c;
.source "SourceFile"


# instance fields
.field private final ijk:Lorg/greenrobot/greendao/internal/a;

.field private final ikl:Lorg/greenrobot/greendao/internal/a;

.field public final klm:Lcom/huawei/hms/analytics/database/LogEventDao;

.field public final lmn:Lcom/huawei/hms/analytics/database/LogConfigDao;


# direct methods
.method public constructor <init>(Lorg/greenrobot/greendao/database/a;Lo4/d;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/database/a;",
            "Lo4/d;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lorg/greenrobot/greendao/a<",
            "**>;>;",
            "Lorg/greenrobot/greendao/internal/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lorg/greenrobot/greendao/c;-><init>(Lorg/greenrobot/greendao/database/a;)V

    const-class p1, Lcom/huawei/hms/analytics/database/LogEventDao;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/greenrobot/greendao/internal/a;

    invoke-virtual {p1}, Lorg/greenrobot/greendao/internal/a;->b()Lorg/greenrobot/greendao/internal/a;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/bf;->ikl:Lorg/greenrobot/greendao/internal/a;

    invoke-virtual {p1, p2}, Lorg/greenrobot/greendao/internal/a;->d(Lo4/d;)V

    const-class v0, Lcom/huawei/hms/analytics/database/LogConfigDao;

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lorg/greenrobot/greendao/internal/a;

    invoke-virtual {p3}, Lorg/greenrobot/greendao/internal/a;->b()Lorg/greenrobot/greendao/internal/a;

    move-result-object p3

    iput-object p3, p0, Lcom/huawei/hms/analytics/bf;->ijk:Lorg/greenrobot/greendao/internal/a;

    invoke-virtual {p3, p2}, Lorg/greenrobot/greendao/internal/a;->d(Lo4/d;)V

    new-instance p2, Lcom/huawei/hms/analytics/database/LogEventDao;

    invoke-direct {p2, p1, p0}, Lcom/huawei/hms/analytics/database/LogEventDao;-><init>(Lorg/greenrobot/greendao/internal/a;Lcom/huawei/hms/analytics/bf;)V

    iput-object p2, p0, Lcom/huawei/hms/analytics/bf;->klm:Lcom/huawei/hms/analytics/database/LogEventDao;

    new-instance p1, Lcom/huawei/hms/analytics/database/LogConfigDao;

    invoke-direct {p1, p3, p0}, Lcom/huawei/hms/analytics/database/LogConfigDao;-><init>(Lorg/greenrobot/greendao/internal/a;Lcom/huawei/hms/analytics/bf;)V

    iput-object p1, p0, Lcom/huawei/hms/analytics/bf;->lmn:Lcom/huawei/hms/analytics/database/LogConfigDao;

    const-class p3, Lcom/huawei/hms/analytics/database/LogEvent;

    invoke-virtual {p0, p3, p2}, Lorg/greenrobot/greendao/c;->registerDao(Ljava/lang/Class;Lorg/greenrobot/greendao/a;)V

    const-class p2, Lcom/huawei/hms/analytics/database/LogConfig;

    invoke-virtual {p0, p2, p1}, Lorg/greenrobot/greendao/c;->registerDao(Ljava/lang/Class;Lorg/greenrobot/greendao/a;)V

    return-void
.end method


# virtual methods
.method public final lmn()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/bf;->ikl:Lorg/greenrobot/greendao/internal/a;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/internal/a;->a()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bf;->ijk:Lorg/greenrobot/greendao/internal/a;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/internal/a;->a()V

    return-void
.end method
