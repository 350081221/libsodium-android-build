.class public Lcom/huawei/hms/analytics/database/APIEventDao$Properties;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/database/APIEventDao;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Properties"
.end annotation


# static fields
.field public static final cde:Lorg/greenrobot/greendao/i;

.field public static final def:Lorg/greenrobot/greendao/i;

.field public static final efg:Lorg/greenrobot/greendao/i;

.field public static final fgh:Lorg/greenrobot/greendao/i;

.field public static final ghi:Lorg/greenrobot/greendao/i;

.field public static final hij:Lorg/greenrobot/greendao/i;

.field public static final ijk:Lorg/greenrobot/greendao/i;

.field public static final ikl:Lorg/greenrobot/greendao/i;

.field public static final klm:Lorg/greenrobot/greendao/i;

.field public static final lmn:Lorg/greenrobot/greendao/i;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lorg/greenrobot/greendao/i;

    const/4 v1, 0x0

    const-class v2, Ljava/lang/Long;

    const-string v3, "id"

    const/4 v4, 0x1

    const-string v5, "_id"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v6, Lcom/huawei/hms/analytics/database/APIEventDao$Properties;->lmn:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v8, 0x1

    const-class v9, Ljava/lang/String;

    const-string v10, "code"

    const/4 v11, 0x0

    const-string v12, "CODE"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/APIEventDao$Properties;->klm:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v2, 0x2

    const-class v3, Ljava/lang/String;

    const-string v4, "timestamp"

    const/4 v5, 0x0

    const-string v6, "TIMESTAMP"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/APIEventDao$Properties;->ikl:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v8, 0x3

    const-class v9, Ljava/lang/String;

    const-string v10, "type"

    const-string v12, "TYPE"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/APIEventDao$Properties;->ijk:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v2, 0x4

    const-class v3, Ljava/lang/String;

    const-string v4, "name"

    const-string v6, "NAME"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/APIEventDao$Properties;->hij:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v8, 0x5

    const-class v9, Ljava/lang/String;

    const-string v10, "result"

    const-string v12, "RESULT"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/APIEventDao$Properties;->ghi:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v2, 0x6

    const-class v3, Ljava/lang/String;

    const-string v4, "errorCode"

    const-string v6, "ERROR_CODE"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/APIEventDao$Properties;->fgh:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v8, 0x7

    const-class v9, Ljava/lang/String;

    const-string v10, "eventId"

    const-string v12, "EVENT_ID"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/APIEventDao$Properties;->efg:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/16 v2, 0x8

    const-class v3, Ljava/lang/String;

    const-string v4, "eventCnt"

    const-string v6, "EVENT_CNT"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/APIEventDao$Properties;->def:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/16 v8, 0x9

    const-class v9, Ljava/lang/String;

    const-string v10, "costTime"

    const-string v12, "COST_TIME"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/APIEventDao$Properties;->cde:Lorg/greenrobot/greendao/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
