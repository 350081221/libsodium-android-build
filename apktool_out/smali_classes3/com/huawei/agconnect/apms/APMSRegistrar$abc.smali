.class public Lcom/huawei/agconnect/apms/APMSRegistrar$abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/common/network/AccessNetworkManager$AccessNetworkCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/APMSRegistrar;->initialize(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Landroid/content/Context;

.field public final synthetic bcd:Lcom/huawei/agconnect/apms/APMSRegistrar;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/APMSRegistrar;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/APMSRegistrar$abc;->bcd:Lcom/huawei/agconnect/apms/APMSRegistrar;

    iput-object p2, p0, Lcom/huawei/agconnect/apms/APMSRegistrar$abc;->abc:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onNetWorkReady()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/apms/APMSRegistrar$abc;->bcd:Lcom/huawei/agconnect/apms/APMSRegistrar;

    iget-object v1, p0, Lcom/huawei/agconnect/apms/APMSRegistrar$abc;->abc:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/APMSRegistrar;->access$000(Lcom/huawei/agconnect/apms/APMSRegistrar;Landroid/content/Context;)V

    return-void
.end method
