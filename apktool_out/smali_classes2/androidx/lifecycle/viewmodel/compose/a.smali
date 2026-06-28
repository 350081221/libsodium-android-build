.class public final synthetic Landroidx/lifecycle/viewmodel/compose/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/properties/d;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/SavedStateHandle;

.field public final synthetic b:Landroidx/compose/runtime/saveable/Saver;

.field public final synthetic c:Lv3/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/SavedStateHandle;Landroidx/compose/runtime/saveable/Saver;Lv3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/viewmodel/compose/a;->a:Landroidx/lifecycle/SavedStateHandle;

    iput-object p2, p0, Landroidx/lifecycle/viewmodel/compose/a;->b:Landroidx/compose/runtime/saveable/Saver;

    iput-object p3, p0, Landroidx/lifecycle/viewmodel/compose/a;->c:Lv3/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/viewmodel/compose/a;->a:Landroidx/lifecycle/SavedStateHandle;

    iget-object v1, p0, Landroidx/lifecycle/viewmodel/compose/a;->b:Landroidx/compose/runtime/saveable/Saver;

    iget-object v2, p0, Landroidx/lifecycle/viewmodel/compose/a;->c:Lv3/a;

    invoke-static {v0, v1, v2, p1, p2}, Landroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt;->a(Landroidx/lifecycle/SavedStateHandle;Landroidx/compose/runtime/saveable/Saver;Lv3/a;Ljava/lang/Object;Lkotlin/reflect/o;)Lkotlin/properties/f;

    move-result-object p1

    return-object p1
.end method
