.class public final synthetic Lcom/yuanqi/master/main/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/main/MainViewModel;

.field public final synthetic b:Lcom/yuanqi/group/home/models/b;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/main/MainViewModel;Lcom/yuanqi/group/home/models/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/main/r;->a:Lcom/yuanqi/master/main/MainViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/main/r;->b:Lcom/yuanqi/group/home/models/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/main/r;->a:Lcom/yuanqi/master/main/MainViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/main/r;->b:Lcom/yuanqi/group/home/models/b;

    invoke-static {v0, v1}, Lcom/yuanqi/master/main/MainViewModel;->a(Lcom/yuanqi/master/main/MainViewModel;Lcom/yuanqi/group/home/models/b;)V

    return-void
.end method
