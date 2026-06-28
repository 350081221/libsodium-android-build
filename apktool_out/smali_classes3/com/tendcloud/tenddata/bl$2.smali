.class final Lcom/tendcloud/tenddata/bl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/cs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bl;->g(Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$features:Lcom/tendcloud/tenddata/a;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bl$2;->val$features:Lcom/tendcloud/tenddata/a;

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
    iget-object v0, p0, Lcom/tendcloud/tenddata/bl$2;->val$features:Lcom/tendcloud/tenddata/a;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/tendcloud/tenddata/i;->a(ZLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
