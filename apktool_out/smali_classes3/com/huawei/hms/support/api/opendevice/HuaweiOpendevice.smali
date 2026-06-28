.class public Lcom/huawei/hms/support/api/opendevice/HuaweiOpendevice;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HUAWEI_OPENDEVICE_API:Lcom/huawei/hms/support/api/opendevice/HuaweiOpendeviceApi;

.field public static final OPEN_DEVICE_API:Lcom/huawei/hms/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/huawei/hms/api/Api<",
            "Lcom/huawei/hms/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/huawei/hms/api/Api;

    .line 2
    .line 3
    const-string v1, "HuaweiOpenDevice.API"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/huawei/hms/api/Api;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/huawei/hms/support/api/opendevice/HuaweiOpendevice;->OPEN_DEVICE_API:Lcom/huawei/hms/api/Api;

    .line 9
    .line 10
    new-instance v0, Lcom/huawei/hms/support/api/opendevice/HuaweiOpendeviceApiImpl;

    .line 11
    .line 12
    invoke-direct {v0}, Lcom/huawei/hms/support/api/opendevice/HuaweiOpendeviceApiImpl;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/huawei/hms/support/api/opendevice/HuaweiOpendevice;->HUAWEI_OPENDEVICE_API:Lcom/huawei/hms/support/api/opendevice/HuaweiOpendeviceApi;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
