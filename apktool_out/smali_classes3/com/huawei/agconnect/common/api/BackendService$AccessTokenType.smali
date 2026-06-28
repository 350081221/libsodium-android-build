.class public final enum Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/common/api/BackendService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AccessTokenType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

.field public static final enum EXPECT:Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

.field public static final enum MUST:Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    const-string v1, "MUST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;->MUST:Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    new-instance v1, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    const-string v3, "EXPECT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;->EXPECT:Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;->$VALUES:[Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;
    .locals 1

    const-class v0, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    return-object p0
.end method

.method public static values()[Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;->$VALUES:[Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    invoke-virtual {v0}, [Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    return-object v0
.end method
