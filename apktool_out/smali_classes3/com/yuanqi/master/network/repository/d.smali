.class public final synthetic Lcom/yuanqi/master/network/repository/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/a;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/MutableLiveData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/network/repository/d;->a:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/network/repository/d;->a:Landroidx/lifecycle/MutableLiveData;

    invoke-static {v0}, Lcom/yuanqi/master/network/repository/e;->h(Landroidx/lifecycle/MutableLiveData;)V

    return-void
.end method
