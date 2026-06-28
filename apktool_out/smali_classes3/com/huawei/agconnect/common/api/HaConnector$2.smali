.class Lcom/huawei/agconnect/common/api/HaConnector$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/credential/obs/ai;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/common/api/HaConnector;->syncOAID(Lcom/huawei/agconnect/common/api/HaSyncCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/agconnect/common/api/HaConnector;

.field final synthetic val$callBack:Lcom/huawei/agconnect/common/api/HaSyncCallBack;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/common/api/HaConnector;Lcom/huawei/agconnect/common/api/HaSyncCallBack;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/common/api/HaConnector$2;->this$0:Lcom/huawei/agconnect/common/api/HaConnector;

    iput-object p2, p0, Lcom/huawei/agconnect/common/api/HaConnector$2;->val$callBack:Lcom/huawei/agconnect/common/api/HaSyncCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public result(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector$2;->val$callBack:Lcom/huawei/agconnect/common/api/HaSyncCallBack;

    invoke-interface {v0, p1, p2}, Lcom/huawei/agconnect/common/api/HaSyncCallBack;->syncCallBack(ILjava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "end sync ha oaid:code:--->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", msg---->"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "HaConnector"

    invoke-static {p2, p1}, Lcom/huawei/agconnect/common/api/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
