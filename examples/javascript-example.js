/**
 * JavaScript Example: Box Drawing with JSON Dataset
 *
 * Use Case:
 * - Demonstrates how Node.js can load structured JSON data.
 * - Useful for building CLI utilities, dashboards, or documentation generators.
 * - Shows students how to parse JSON and manipulate strings.
 */

const fs = require('fs');

// Load dataset
const chars = JSON.parse(fs.readFileSync('../datasets/box-drawing-common.json', 'utf8'));

// Helper function to fetch a symbol by Unicode code
function getSymbol(code) {
  return chars.find(c => c.unicode === code).symbol;
}

// Select characters
const horiz = getSymbol('U+2500'); // ─
const vert  = getSymbol('U+2502'); // │
const tl    = getSymbol('U+250C'); // ┌
const tr    = getSymbol('U+2510'); // ┐
const bl    = getSymbol('U+2514'); // └
const br    = getSymbol('U+2518'); // ┘

// Render a box around text
function boxText(text) {
  const width = text.length;
  return (
    tl + horiz.repeat(width) + tr + '\n' +
    vert + text + vert + '\n' +
    bl + horiz.repeat(width) + br
  );
}

// Example output
console.log(boxText("Hello World"));