.class Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$IHttpCheckCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->doRequestAsync(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;


# direct methods
.method constructor <init>(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$3;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onHttpCheckFinish(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;)V
    .locals 1

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$3;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->access$300(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;)V

    return-void
.end method
