.class public final synthetic Lcom/lody/virtual/client/hook/proxies/shortcut/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/content/pm/ShortcutInfo;)Landroid/content/Intent;
    .locals 0

    invoke-virtual {p0}, Landroid/content/pm/ShortcutInfo;->getIntent()Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method
