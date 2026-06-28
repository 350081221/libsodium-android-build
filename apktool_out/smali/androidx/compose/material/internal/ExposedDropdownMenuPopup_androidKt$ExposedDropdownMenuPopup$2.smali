.class final Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt;->ExposedDropdownMenuPopup(Lv3/a;Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/r2;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

.field final synthetic $onDismissRequest:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $popupLayout:Landroidx/compose/material/internal/PopupLayout;

.field final synthetic $testTag:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroidx/compose/material/internal/PopupLayout;Lv3/a;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/internal/PopupLayout;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;->$popupLayout:Landroidx/compose/material/internal/PopupLayout;

    iput-object p2, p0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;->$onDismissRequest:Lv3/a;

    iput-object p3, p0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;->$testTag:Ljava/lang/String;

    iput-object p4, p0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;->$layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;->$popupLayout:Landroidx/compose/material/internal/PopupLayout;

    .line 3
    iget-object v1, p0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;->$onDismissRequest:Lv3/a;

    .line 4
    iget-object v2, p0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;->$testTag:Ljava/lang/String;

    .line 5
    iget-object v3, p0, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2;->$layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 6
    invoke-virtual {v0, v1, v2, v3}, Landroidx/compose/material/internal/PopupLayout;->updateParameters(Lv3/a;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V

    return-void
.end method
