.class public final synthetic Ls1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/f;->a:Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ls1/f;->a:Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;

    invoke-static {v0}, Lcom/huawei/agconnect/apms/wvu;->bcd(Lcom/huawei/agconnect/apms/hilog/task/FetchTask$FetchCallback;)V

    return-void
.end method
