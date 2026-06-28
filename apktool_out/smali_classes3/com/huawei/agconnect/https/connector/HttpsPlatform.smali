.class public Lcom/huawei/agconnect/https/connector/HttpsPlatform;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final INSTANCE:Lcom/huawei/agconnect/https/connector/HttpsPlatform;


# instance fields
.field private connector:Lcom/huawei/agconnect/https/connector/Connector;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/https/connector/HttpsPlatform;

    invoke-direct {v0}, Lcom/huawei/agconnect/https/connector/HttpsPlatform;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/https/connector/HttpsPlatform;->INSTANCE:Lcom/huawei/agconnect/https/connector/HttpsPlatform;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/huawei/agconnect/https/connector/HttpsPlatform;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/https/connector/HttpsPlatform;->INSTANCE:Lcom/huawei/agconnect/https/connector/HttpsPlatform;

    return-object v0
.end method


# virtual methods
.method public getConnector()Lcom/huawei/agconnect/https/connector/Connector;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/https/connector/HttpsPlatform;->connector:Lcom/huawei/agconnect/https/connector/Connector;

    return-object v0
.end method

.method public init(Lcom/huawei/agconnect/https/connector/Connector;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/https/connector/HttpsPlatform;->connector:Lcom/huawei/agconnect/https/connector/Connector;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/huawei/agconnect/https/connector/HttpsPlatform;->connector:Lcom/huawei/agconnect/https/connector/Connector;

    :cond_0
    return-void
.end method
