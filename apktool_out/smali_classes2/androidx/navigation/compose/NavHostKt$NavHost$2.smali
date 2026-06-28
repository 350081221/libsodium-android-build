.class final Landroidx/navigation/compose/NavHostKt$NavHost$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)V
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
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $builder:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/navigation/NavGraphBuilder;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $navController:Landroidx/navigation/NavHostController;

.field final synthetic $route:Ljava/lang/String;

.field final synthetic $startDestination:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lv3/l;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHostController;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Lv3/l<",
            "-",
            "Landroidx/navigation/NavGraphBuilder;",
            "Lkotlin/r2;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$navController:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$startDestination:Ljava/lang/String;

    iput-object p3, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$route:Ljava/lang/String;

    iput-object p5, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$builder:Lv3/l;

    iput p6, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$$changed:I

    iput p7, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/navigation/compose/NavHostKt$NavHost$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$navController:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$startDestination:Ljava/lang/String;

    iget-object v2, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$route:Ljava/lang/String;

    iget-object v4, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$builder:Lv3/l;

    iget p2, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    iget v7, p0, Landroidx/navigation/compose/NavHostKt$NavHost$2;->$$default:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
