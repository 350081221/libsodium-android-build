.class Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$IHttpCheckCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->doRequestSync(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

.field final synthetic val$passContext:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;

.field final synthetic val$syncCallback:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;

.field final synthetic val$syncTimer:Ljava/util/Timer;


# direct methods
.method constructor <init>(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;Ljava/util/Timer;Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    iput-object p2, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$syncTimer:Ljava/util/Timer;

    iput-object p3, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$passContext:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;

    iput-object p4, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$syncCallback:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onHttpCheckFinish(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;)V
    .locals 6

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$syncTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->access$400(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$passContext:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;

    iget-object v1, v1, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->reqSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->access$400(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$passContext:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;

    iget-object v1, v1, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->reqSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->access$300(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$syncCallback:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    iget-object v1, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$passContext:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;

    iget-object v1, v1, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->inputUrl:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->access$500(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;Ljava/lang/String;Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$syncCallback:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;

    invoke-interface {v0, v1}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;->onSyncCheckFinish(Z)V

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$syncCallback:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;

    invoke-interface {v0, v2}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;->onSyncCheckFinish(Z)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    iget-object v4, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$passContext:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;

    iget-object v4, v4, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->appid:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->getStoredData(Ljava/lang/String;)Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$WXSecurityData;

    move-result-object v0

    iget-object v4, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    iget-object v5, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$passContext:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;

    iget-object v5, v5, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->appid:Ljava/lang/String;

    iget-object v0, v0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$WXSecurityData;->respDataJson:Ljava/lang/String;

    invoke-virtual {v4, v5, v0}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->convert2ShareRule(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;

    move-result-object v0

    iget-object v4, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    iget-object v5, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$passContext:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;

    iget-object v5, v5, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->inputUrl:Ljava/lang/String;

    invoke-static {v4, v5, v0}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->access$500(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;Ljava/lang/String;Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;)I

    move-result v0

    iget-object v4, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$5;->val$syncCallback:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;

    if-eq v0, v3, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    :goto_1
    invoke-interface {v4, v1}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecuritySyncCheck;->onSyncCheckFinish(Z)V

    goto :goto_0
.end method
