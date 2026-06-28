.class final Lcom/yuanqi/master/location/MapActivity$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/location/MapActivity;->d0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/tools/r0;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/yuanqi/master/tools/Failure;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yuanqi/master/location/MapActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/location/MapActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/location/MapActivity$e;->this$0:Lcom/yuanqi/master/location/MapActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/tools/r0;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/location/MapActivity$e;->invoke(Lcom/yuanqi/master/tools/r0;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/tools/r0;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity$e;->this$0:Lcom/yuanqi/master/location/MapActivity;

    invoke-static {v0}, Lcom/yuanqi/master/location/MapActivity;->W(Lcom/yuanqi/master/location/MapActivity;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/yuanqi/group/App;->d:Lcom/yuanqi/group/App$a;

    invoke-virtual {v1}, Lcom/yuanqi/group/App$a;->c()Lcom/google/gson/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/gson/f;->z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
