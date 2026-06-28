.class public Lcom/huawei/agconnect/apms/y0$bcd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/apms/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "bcd"
.end annotation


# direct methods
.method public synthetic constructor <init>(Lcom/huawei/agconnect/apms/y0$abc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->getInstance()Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->uiHidden()V

    return-void
.end method
