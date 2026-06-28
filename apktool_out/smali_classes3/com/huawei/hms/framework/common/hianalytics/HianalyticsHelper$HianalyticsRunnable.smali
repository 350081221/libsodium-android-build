.class Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper$HianalyticsRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "HianalyticsRunnable"
.end annotation


# instance fields
.field private final data:Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;

.field private final event:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper$HianalyticsRunnable;->data:Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper$HianalyticsRunnable;->event:Ljava/lang/String;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper;->getInstance()Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper$HianalyticsRunnable;->data:Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;

    invoke-virtual {v1}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;->get()Ljava/util/LinkedHashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper$HianalyticsRunnable;->event:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper;->onEvent(Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    return-void
.end method
