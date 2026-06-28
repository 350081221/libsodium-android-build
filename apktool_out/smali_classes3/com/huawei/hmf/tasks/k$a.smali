.class Lcom/huawei/hmf/tasks/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hmf/tasks/k;-><init>(Lcom/huawei/hmf/tasks/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hmf/tasks/k;


# direct methods
.method constructor <init>(Lcom/huawei/hmf/tasks/k;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hmf/tasks/k$a;->a:Lcom/huawei/hmf/tasks/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hmf/tasks/k$a;->a:Lcom/huawei/hmf/tasks/k;

    invoke-static {v0}, Lcom/huawei/hmf/tasks/k;->a(Lcom/huawei/hmf/tasks/k;)Lcom/huawei/hmf/tasks/a/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hmf/tasks/a/i;->B()Z

    return-void
.end method
