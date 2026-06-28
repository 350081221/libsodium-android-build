.class public Lcom/huawei/agconnect/apms/log/AgentLogManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static instance:Lcom/huawei/agconnect/apms/a1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/apms/a1;

    invoke-direct {v0}, Lcom/huawei/agconnect/apms/a1;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/apms/log/AgentLogManager;->instance:Lcom/huawei/agconnect/apms/a1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/apms/log/AgentLogManager;->instance:Lcom/huawei/agconnect/apms/a1;

    return-object v0
.end method
