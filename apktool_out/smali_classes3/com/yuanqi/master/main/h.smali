.class public final synthetic Lcom/yuanqi/master/main/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/g;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/models/b;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/models/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/main/h;->a:Lcom/yuanqi/group/home/models/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/main/h;->a:Lcom/yuanqi/group/home/models/b;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Lcom/yuanqi/master/main/MainViewModel;->e(Lcom/yuanqi/group/home/models/b;Ljava/lang/Void;)V

    return-void
.end method
