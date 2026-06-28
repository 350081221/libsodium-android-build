.class public final synthetic Lcom/yuanqi/master/main/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/g;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/main/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/main/MainViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/main/l;->a:Lcom/yuanqi/master/main/MainViewModel;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/main/l;->a:Lcom/yuanqi/master/main/MainViewModel;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/yuanqi/master/main/MainViewModel;->b(Lcom/yuanqi/master/main/MainViewModel;Ljava/util/List;)V

    return-void
.end method
