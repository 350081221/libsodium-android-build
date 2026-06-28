.class public Lcom/huawei/agconnect/apms/cde;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/def;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    invoke-static {}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->getInstance()Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    move-result-object v0

    invoke-static {}, Lcom/huawei/agconnect/apms/v1;->jkl()Lcom/huawei/agconnect/apms/v1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->addApplicationStateListener(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;)V

    return-void
.end method
