.class final Lorg/burnoutcrew/reorderable/f$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/burnoutcrew/reorderable/f;->c(Lorg/burnoutcrew/reorderable/l;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lv3/r;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $content:Lv3/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/r<",
            "Landroidx/compose/foundation/layout/BoxScope;",
            "Ljava/lang/Boolean;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $defaultDraggingModifier:Landroidx/compose/ui/Modifier;

.field final synthetic $index:Ljava/lang/Integer;

.field final synthetic $key:Ljava/lang/Object;

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $orientationLocked:Z

.field final synthetic $state:Lorg/burnoutcrew/reorderable/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/burnoutcrew/reorderable/l<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lorg/burnoutcrew/reorderable/l;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lv3/r;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/burnoutcrew/reorderable/l<",
            "*>;",
            "Ljava/lang/Object;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Ljava/lang/Integer;",
            "Lv3/r<",
            "-",
            "Landroidx/compose/foundation/layout/BoxScope;",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/burnoutcrew/reorderable/f$c;->$state:Lorg/burnoutcrew/reorderable/l;

    iput-object p2, p0, Lorg/burnoutcrew/reorderable/f$c;->$key:Ljava/lang/Object;

    iput-object p3, p0, Lorg/burnoutcrew/reorderable/f$c;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lorg/burnoutcrew/reorderable/f$c;->$defaultDraggingModifier:Landroidx/compose/ui/Modifier;

    iput-boolean p5, p0, Lorg/burnoutcrew/reorderable/f$c;->$orientationLocked:Z

    iput-object p6, p0, Lorg/burnoutcrew/reorderable/f$c;->$index:Ljava/lang/Integer;

    iput-object p7, p0, Lorg/burnoutcrew/reorderable/f$c;->$content:Lv3/r;

    iput p8, p0, Lorg/burnoutcrew/reorderable/f$c;->$$changed:I

    iput p9, p0, Lorg/burnoutcrew/reorderable/f$c;->$$default:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/f$c;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Lorg/burnoutcrew/reorderable/f$c;->$state:Lorg/burnoutcrew/reorderable/l;

    iget-object v1, p0, Lorg/burnoutcrew/reorderable/f$c;->$key:Ljava/lang/Object;

    iget-object v2, p0, Lorg/burnoutcrew/reorderable/f$c;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lorg/burnoutcrew/reorderable/f$c;->$defaultDraggingModifier:Landroidx/compose/ui/Modifier;

    iget-boolean v4, p0, Lorg/burnoutcrew/reorderable/f$c;->$orientationLocked:Z

    iget-object v5, p0, Lorg/burnoutcrew/reorderable/f$c;->$index:Ljava/lang/Integer;

    iget-object v6, p0, Lorg/burnoutcrew/reorderable/f$c;->$content:Lv3/r;

    iget p2, p0, Lorg/burnoutcrew/reorderable/f$c;->$$changed:I

    or-int/lit8 v8, p2, 0x1

    iget v9, p0, Lorg/burnoutcrew/reorderable/f$c;->$$default:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Lorg/burnoutcrew/reorderable/f;->c(Lorg/burnoutcrew/reorderable/l;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lv3/r;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
