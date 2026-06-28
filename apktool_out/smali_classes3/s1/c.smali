.class public final synthetic Ls1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;


# direct methods
.method public synthetic constructor <init>(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/c;->a:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ls1/c;->a:Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;

    invoke-static {v0}, Lcom/huawei/agconnect/apms/wvu;->cde(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)V

    return-void
.end method
