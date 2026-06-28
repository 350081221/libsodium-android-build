.class public final synthetic Lu1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/i;


# instance fields
.field public final synthetic a:Lcom/huawei/agconnect/apms/hilog/task/FetchTask;


# direct methods
.method public synthetic constructor <init>(Lcom/huawei/agconnect/apms/hilog/task/FetchTask;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/b;->a:Lcom/huawei/agconnect/apms/hilog/task/FetchTask;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu1/b;->a:Lcom/huawei/agconnect/apms/hilog/task/FetchTask;

    check-cast p1, Lcom/huawei/agconnect/remoteconfig/ConfigValues;

    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/hilog/task/FetchTask;->a(Lcom/huawei/agconnect/apms/hilog/task/FetchTask;Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V

    return-void
.end method
