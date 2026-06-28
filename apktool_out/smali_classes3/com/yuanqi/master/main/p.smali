.class public final synthetic Lcom/yuanqi/master/main/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/g;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/yuanqi/master/main/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/yuanqi/master/main/MainViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/main/p;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/yuanqi/master/main/p;->b:Lcom/yuanqi/master/main/MainViewModel;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/main/p;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/yuanqi/master/main/p;->b:Lcom/yuanqi/master/main/MainViewModel;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, v1, p1}, Lcom/yuanqi/master/main/MainViewModel;->m(Ljava/util/List;Lcom/yuanqi/master/main/MainViewModel;Ljava/lang/Void;)V

    return-void
.end method
