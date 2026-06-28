.class Lcom/tendcloud/tenddata/bp$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/cs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bp;->a(JLcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/bp;

.field final synthetic val$service:Lcom/tendcloud/tenddata/a;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/bp;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bp$2;->this$0:Lcom/tendcloud/tenddata/bp;

    iput-object p2, p0, Lcom/tendcloud/tenddata/bp$2;->val$service:Lcom/tendcloud/tenddata/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStoreFailed()V
    .locals 0

    return-void
.end method

.method public onStoreSuccess()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/bp$2;->this$0:Lcom/tendcloud/tenddata/bp;

    iget-object v1, p0, Lcom/tendcloud/tenddata/bp$2;->val$service:Lcom/tendcloud/tenddata/a;

    invoke-static {v0, v1}, Lcom/tendcloud/tenddata/bp;->a(Lcom/tendcloud/tenddata/bp;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
