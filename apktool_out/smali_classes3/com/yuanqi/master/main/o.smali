.class public final synthetic Lcom/yuanqi/master/main/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/j;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/main/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/main/MainViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/main/o;->a:Lcom/yuanqi/master/main/MainViewModel;

    return-void
.end method


# virtual methods
.method public final onFail(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/main/o;->a:Lcom/yuanqi/master/main/MainViewModel;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/yuanqi/master/main/MainViewModel;->d(Lcom/yuanqi/master/main/MainViewModel;Ljava/lang/Throwable;)V

    return-void
.end method
