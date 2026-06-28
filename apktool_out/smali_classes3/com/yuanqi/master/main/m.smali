.class public final synthetic Lcom/yuanqi/master/main/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/models/AppInfoLite;

.field public final synthetic b:Lcom/yuanqi/master/main/MainViewModel;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/models/AppInfoLite;Lcom/yuanqi/master/main/MainViewModel;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/main/m;->a:Lcom/yuanqi/group/home/models/AppInfoLite;

    iput-object p2, p0, Lcom/yuanqi/master/main/m;->b:Lcom/yuanqi/master/main/MainViewModel;

    iput-object p3, p0, Lcom/yuanqi/master/main/m;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/main/m;->a:Lcom/yuanqi/group/home/models/AppInfoLite;

    iget-object v1, p0, Lcom/yuanqi/master/main/m;->b:Lcom/yuanqi/master/main/MainViewModel;

    iget-object v2, p0, Lcom/yuanqi/master/main/m;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/yuanqi/master/main/MainViewModel;->i(Lcom/yuanqi/group/home/models/AppInfoLite;Lcom/yuanqi/master/main/MainViewModel;Ljava/util/List;)V

    return-void
.end method
