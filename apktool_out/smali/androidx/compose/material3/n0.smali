.class public final synthetic Landroidx/compose/material3/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lv3/a;


# direct methods
.method public synthetic constructor <init>(Lv3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/material3/n0;->a:Lv3/a;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/material3/n0;->a:Lv3/a;

    invoke-static {v0}, Landroidx/compose/material3/ModalBottomSheetWindow$Api33Impl;->a(Lv3/a;)V

    return-void
.end method
