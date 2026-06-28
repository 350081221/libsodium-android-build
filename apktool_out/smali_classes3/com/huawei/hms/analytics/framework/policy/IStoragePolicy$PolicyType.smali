.class public final enum Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PolicyType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

.field public static final enum NETWORK:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

.field public static final enum PARAMS:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

.field public static final enum STORAGECYCLY:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

.field public static final enum STORAGELENGTH:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

.field public static final enum STORAGESIZE:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const-string v1, "NETWORK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->NETWORK:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    new-instance v1, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const-string v3, "STORAGECYCLY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->STORAGECYCLY:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    new-instance v3, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const-string v5, "STORAGELENGTH"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->STORAGELENGTH:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    new-instance v5, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const-string v7, "STORAGESIZE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->STORAGESIZE:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    new-instance v7, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const-string v9, "PARAMS"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->PARAMS:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->$VALUES:[Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;
    .locals 1

    const-class v0, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    return-object p0
.end method

.method public static values()[Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->$VALUES:[Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    invoke-virtual {v0}, [Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    return-object v0
.end method
