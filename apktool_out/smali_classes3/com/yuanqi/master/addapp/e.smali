.class public final synthetic Lcom/yuanqi/master/addapp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Lv3/l;


# direct methods
.method public synthetic constructor <init>(Lv3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/addapp/e;->a:Lv3/l;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/addapp/e;->a:Lv3/l;

    invoke-static {v0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$h;->j(Lv3/l;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
