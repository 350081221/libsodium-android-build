.class public final Lcom/yuanqi/master/tools/o0$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yuanqi/master/tools/z0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/tools/o0;->K0(Landroid/content/Context;Ljava/util/List;Lv3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/yuanqi/master/tools/DialogUtil$showUserInfoDialog$mAdapter$1$1",
        "Lcom/yuanqi/master/tools/OnItemClickListener;",
        "onItemClick",
        "",
        "view",
        "Landroid/view/View;",
        "position",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuanqi/master/network/model/response/UserInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/yuanqi/master/tools/dialog/b;


# direct methods
.method constructor <init>(Lv3/l;Ljava/util/List;Lcom/yuanqi/master/tools/dialog/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/r2;",
            ">;",
            "Ljava/util/List<",
            "Lcom/yuanqi/master/network/model/response/UserInfo;",
            ">;",
            "Lcom/yuanqi/master/tools/dialog/b;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/yuanqi/master/tools/o0$i;->a:Lv3/l;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/yuanqi/master/tools/o0$i;->b:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/yuanqi/master/tools/o0$i;->c:Lcom/yuanqi/master/tools/dialog/b;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/yuanqi/master/tools/o0$i;->a:Lv3/l;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/tools/o0$i;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lcom/yuanqi/master/network/model/response/UserInfo;

    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/yuanqi/master/network/model/response/UserInfo;->getUserId()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-interface {p1, p2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/yuanqi/master/tools/o0$i;->c:Lcom/yuanqi/master/tools/dialog/b;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
