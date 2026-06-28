.class public interface abstract Lcom/yuanqi/group/home/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/home/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\u0008\u001a\u00020\u00032\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0016\u0010\u000b\u001a\u00020\u00032\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\n0\rH&J\u0012\u0010\u000e\u001a\u00020\u00032\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H&J\u0008\u0010\u0016\u001a\u00020\u0003H&J\u0016\u0010\u0017\u001a\u00020\u00032\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&JV\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0008\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u00072\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00030(2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00030(H&\u00a8\u0006*"
    }
    d2 = {
        "Lcom/yuanqi/group/home/HomeContract$HomePresenter;",
        "Lcom/yuanqi/group/abs/BasePresenter;",
        "addApp",
        "",
        "info",
        "Lcom/yuanqi/group/home/models/AppInfoLite;",
        "checkExtPackageBootPermission",
        "",
        "deleteApp",
        "data",
        "Lcom/yuanqi/group/home/models/AppData;",
        "deleteAppList",
        "dataList",
        "",
        "enterAppSetting",
        "getLabel",
        "",
        "packageName",
        "launchAppBefore",
        "userId",
        "",
        "name",
        "requestVirtualApp",
        "saveConfig",
        "list",
        "",
        "showInstall32BitExt",
        "context",
        "Landroid/content/Context;",
        "showPopupMenu",
        "activity",
        "Landroid/app/Activity;",
        "position",
        "view",
        "Landroid/view/View;",
        "model",
        "noteApp",
        "Lcom/yuanqi/master/database/model/AppNote;",
        "isFirst",
        "shouldLogin",
        "Lkotlin/Function0;",
        "shouldVip",
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


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/lang/String;
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract b(Lcom/yuanqi/group/home/models/b;)V
    .param p1    # Lcom/yuanqi/group/home/models/b;
        .annotation build Lp4/m;
        .end annotation
    .end param
.end method

.method public abstract c(Lcom/yuanqi/group/home/models/AppInfoLite;)V
    .param p1    # Lcom/yuanqi/group/home/models/AppInfoLite;
        .annotation build Lp4/m;
        .end annotation
    .end param
.end method

.method public abstract d(Landroid/content/Context;)V
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract e(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/yuanqi/group/home/models/b;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract f()Z
.end method

.method public abstract g(ILjava/lang/String;Ljava/lang/String;)V
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract h()V
.end method

.method public abstract i(Lcom/yuanqi/group/home/models/b;)V
    .param p1    # Lcom/yuanqi/group/home/models/b;
        .annotation build Lp4/m;
        .end annotation
    .end param
.end method

.method public abstract j(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuanqi/group/home/models/b;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract k(Landroid/app/Activity;ILandroid/view/View;Lcom/yuanqi/group/home/models/b;Lv2/b;ZLv3/a;Lv3/a;)V
    .param p1    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lcom/yuanqi/group/home/models/b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Lv2/b;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p8    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "I",
            "Landroid/view/View;",
            "Lcom/yuanqi/group/home/models/b;",
            "Lv2/b;",
            "Z",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method
