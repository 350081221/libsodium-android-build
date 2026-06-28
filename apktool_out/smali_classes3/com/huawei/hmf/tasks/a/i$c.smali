.class final Lcom/huawei/hmf/tasks/a/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hmf/tasks/a/i;->x(Ljava/util/concurrent/Executor;Lcom/huawei/hmf/tasks/j;)Lcom/huawei/hmf/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hmf/tasks/a/i;

.field final synthetic b:Lcom/huawei/hmf/tasks/a/i;


# direct methods
.method constructor <init>(Lcom/huawei/hmf/tasks/a/i;Lcom/huawei/hmf/tasks/a/i;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hmf/tasks/a/i$c;->b:Lcom/huawei/hmf/tasks/a/i;

    iput-object p2, p0, Lcom/huawei/hmf/tasks/a/i$c;->a:Lcom/huawei/hmf/tasks/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hmf/tasks/a/i$c;->a:Lcom/huawei/hmf/tasks/a/i;

    invoke-virtual {v0}, Lcom/huawei/hmf/tasks/a/i;->B()Z

    return-void
.end method
